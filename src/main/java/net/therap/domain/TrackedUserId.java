package net.therap.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
<<<<<<< HEAD
 * user: pritom
=======
 * User: pritom
>>>>>>> 958d29b8c056bfe7629bdb3f882003e9797e4933
 * Date: 5/31/12
 * Time: 1:00 PM
 * To change this template use File | Settings | File Templates.
 */

@Embeddable
public class TrackedUserId implements Serializable{

    private User user;
    private User trackedUser;

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public User getTrackedUser() {
        return trackedUser;
    }

    public void setTrackedUser(User trackedUser) {
        this.trackedUser = trackedUser;
    }
}
