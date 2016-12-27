package sasa.pky.eyefight;

import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Tracker;
import com.google.android.gms.vision.face.Face;

import org.greenrobot.eventbus.EventBus;

/**
 * Created by schrws on 16. 9. 27.
 */

public class FaceTracker extends Tracker<Face> {

    private static final float PROB_THRESHOLD = 0.2f;
    private static final String TAG = FaceTracker.class.getSimpleName();
    private boolean leftClosed;
    private boolean rightClosed;

    @Override
    public void onUpdate(Detector.Detections<Face> detections, Face face) {
        /*if (leftClosed && face.getIsLeftEyeOpenProbability() > PROB_THRESHOLD) {
            leftClosed = false;
        } else if (!leftClosed &&  face.getIsLeftEyeOpenProbability() < PROB_THRESHOLD){
            leftClosed = true;
        }
        if (rightClosed && face.getIsRightEyeOpenProbability() > PROB_THRESHOLD) {
            rightClosed = false;
        } else if (!rightClosed && face.getIsRightEyeOpenProbability() < PROB_THRESHOLD) {
            rightClosed = true;
        }*/

        leftClosed = face.getIsLeftEyeOpenProbability() < PROB_THRESHOLD;
        rightClosed = face.getIsRightEyeOpenProbability() < PROB_THRESHOLD;

        if (!leftClosed && !rightClosed) EventBus.getDefault().post(new OpenedEvent());
        else EventBus.getDefault().post(new ClosedEvent());
    }
}
