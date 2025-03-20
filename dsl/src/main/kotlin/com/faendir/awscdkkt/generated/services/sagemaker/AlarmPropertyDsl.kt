package com.faendir.awscdkkt.generated.services.sagemaker

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnInferenceComponent

@Generated
public fun buildAlarmProperty(initializer: @AwsCdkDsl
    CfnInferenceComponent.AlarmProperty.Builder.() -> Unit = {}):
    CfnInferenceComponent.AlarmProperty =
    CfnInferenceComponent.AlarmProperty.Builder().apply(initializer).build()
