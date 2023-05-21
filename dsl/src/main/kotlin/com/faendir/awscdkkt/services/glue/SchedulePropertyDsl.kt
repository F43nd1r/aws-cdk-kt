package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun scheduleProperty(initializer: CfnCrawler.ScheduleProperty.Builder.() -> Unit = {}):
    CfnCrawler.ScheduleProperty = CfnCrawler.ScheduleProperty.builder().apply(initializer).build()
