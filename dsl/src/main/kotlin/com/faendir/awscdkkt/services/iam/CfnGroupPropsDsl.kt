package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnGroupProps

@Generated
public fun cfnGroupProps(initializer: CfnGroupProps.Builder.() -> Unit = {}): CfnGroupProps =
    CfnGroupProps.builder().apply(initializer).build()
