package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnUserProps

@Generated
public fun cfnUserProps(initializer: CfnUserProps.Builder.() -> Unit = {}): CfnUserProps =
    CfnUserProps.builder().apply(initializer).build()
