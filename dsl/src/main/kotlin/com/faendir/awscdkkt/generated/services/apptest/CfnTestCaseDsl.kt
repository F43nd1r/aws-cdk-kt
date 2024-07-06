package com.faendir.awscdkkt.generated.services.apptest

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apptest.CfnTestCase
import software.amazon.awscdk.services.apptest.CfnTestCaseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTestCase(
  id: String,
  props: CfnTestCaseProps,
  initializer: @AwsCdkDsl CfnTestCase.() -> Unit = {},
): CfnTestCase = CfnTestCase(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTestCase(id: String, initializer: @AwsCdkDsl
    CfnTestCase.Builder.() -> Unit = {}): CfnTestCase = CfnTestCase.Builder.create(this,
    id).apply(initializer).build()
