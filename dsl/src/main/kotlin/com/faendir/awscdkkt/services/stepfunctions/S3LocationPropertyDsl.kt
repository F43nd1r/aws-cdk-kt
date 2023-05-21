package com.faendir.awscdkkt.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine

@Generated
public fun s3LocationProperty(initializer: CfnStateMachine.S3LocationProperty.Builder.() -> Unit =
    {}): CfnStateMachine.S3LocationProperty =
    CfnStateMachine.S3LocationProperty.builder().apply(initializer).build()
