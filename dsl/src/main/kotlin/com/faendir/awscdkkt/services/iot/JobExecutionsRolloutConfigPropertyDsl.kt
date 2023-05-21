package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate

@Generated
public
    fun jobExecutionsRolloutConfigProperty(initializer: CfnJobTemplate.JobExecutionsRolloutConfigProperty.Builder.() -> Unit
    = {}): CfnJobTemplate.JobExecutionsRolloutConfigProperty =
    CfnJobTemplate.JobExecutionsRolloutConfigProperty.builder().apply(initializer).build()
