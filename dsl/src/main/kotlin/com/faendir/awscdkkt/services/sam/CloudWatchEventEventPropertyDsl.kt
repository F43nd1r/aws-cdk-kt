@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

public
    fun cloudWatchEventEventProperty(initializer: CfnStateMachine.CloudWatchEventEventProperty.Builder.() -> Unit):
    CfnStateMachine.CloudWatchEventEventProperty =
    CfnStateMachine.CloudWatchEventEventProperty.builder().apply(initializer).build()
