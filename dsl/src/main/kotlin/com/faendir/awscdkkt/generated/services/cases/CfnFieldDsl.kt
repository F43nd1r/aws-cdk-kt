package com.faendir.awscdkkt.generated.services.cases

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cases.CfnField
import software.amazon.awscdk.services.cases.CfnFieldProps
import software.constructs.Construct

@Generated
public fun Construct.cfnField(
  id: String,
  props: CfnFieldProps,
  initializer: @AwsCdkDsl CfnField.() -> Unit = {},
): CfnField = CfnField(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnField(id: String, initializer: @AwsCdkDsl CfnField.Builder.() -> Unit = {}): CfnField = CfnField.Builder.create(this, id).apply(initializer).build()
