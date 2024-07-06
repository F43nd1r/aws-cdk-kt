package com.faendir.awscdkkt.generated.services.apptest

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apptest.CfnTestCase

@Generated
public fun buildOutputProperty(initializer: @AwsCdkDsl CfnTestCase.OutputProperty.Builder.() -> Unit
    = {}): CfnTestCase.OutputProperty =
    CfnTestCase.OutputProperty.Builder().apply(initializer).build()
