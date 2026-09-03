package com.faendir.awscdkkt.generated.services.cases

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cases.CfnCase
import software.amazon.awscdk.services.cases.CfnCaseProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCase(
  id: String,
  props: CfnCaseProps,
  initializer: @AwsCdkDsl CfnCase.() -> Unit = {},
): CfnCase = CfnCase(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnCase(id: String, initializer: @AwsCdkDsl CfnCase.Builder.() -> Unit = {}): CfnCase = CfnCase.Builder.create(this, id).apply(initializer).build()
