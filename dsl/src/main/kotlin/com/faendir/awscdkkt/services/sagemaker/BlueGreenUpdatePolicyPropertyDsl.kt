package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

@Generated
public
    fun blueGreenUpdatePolicyProperty(initializer: CfnEndpoint.BlueGreenUpdatePolicyProperty.Builder.() -> Unit
    = {}): CfnEndpoint.BlueGreenUpdatePolicyProperty =
    CfnEndpoint.BlueGreenUpdatePolicyProperty.builder().apply(initializer).build()
