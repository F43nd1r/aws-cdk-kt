package com.faendir.awscdkkt.services.fsx

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.fsx.CfnVolume

@Generated
public fun tieringPolicyProperty(initializer: CfnVolume.TieringPolicyProperty.Builder.() -> Unit =
    {}): CfnVolume.TieringPolicyProperty =
    CfnVolume.TieringPolicyProperty.builder().apply(initializer).build()
