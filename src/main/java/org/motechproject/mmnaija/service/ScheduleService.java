/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.motechproject.mmnaija.service;

import java.util.List;
import org.motechproject.mmnaija.domain.Schedule;
import org.motechproject.mmnaija.domain.ScheduleStatus;
import org.motechproject.mmnaija.domain.Subscription;

/**
 *
 * @author seth
 */
public interface ScheduleService {

    public Schedule add(Schedule schedule);

    public Schedule create(Subscription subscription, org.motechproject.mmnaija.domain.Message msg, ScheduleStatus status);

    public Schedule create(Subscription subscription, org.motechproject.mmnaija.domain.Message msg, ScheduleStatus status, String callStatus, String callDuration);

    Schedule findActiveScheduleRequestBySubscription(String callerId);

    List<Schedule> findScheduledRequests();

    List<Schedule> getAll();

    void delete(Schedule messageRequest);

    Schedule update(Schedule messageRequest);
    
    public Schedule schedule(Schedule sch);
    
    
    public void scheduledRequest();
    
}
