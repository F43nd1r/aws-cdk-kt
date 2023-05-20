@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

public
    fun cloudWatchLogsLogGroupProperty(initializer: CfnStateMachine.CloudWatchLogsLogGroupProperty.Builder.() -> Unit):
    CfnStateMachine.CloudWatchLogsLogGroupProperty =
    CfnStateMachine.CloudWatchLogsLogGroupProperty.builder().apply(initializer).build()
