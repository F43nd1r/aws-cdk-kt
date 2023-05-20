@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnStateMachine

public fun s3LocationProperty(initializer: CfnStateMachine.S3LocationProperty.Builder.() -> Unit):
    CfnStateMachine.S3LocationProperty =
    CfnStateMachine.S3LocationProperty.builder().apply(initializer).build()
