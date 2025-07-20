package com.faendir.awscdkkt.generated.services.amplifyuibuilder

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps
import software.constructs.Construct

@Generated
public fun Construct.cfnForm(id: String, initializer: @AwsCdkDsl CfnForm.() -> Unit = {}): CfnForm = CfnForm(this, id).apply(initializer)

@Generated
public fun Construct.cfnForm(
  id: String,
  props: CfnFormProps,
  initializer: @AwsCdkDsl CfnForm.() -> Unit = {},
): CfnForm = CfnForm(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnForm(id: String, initializer: @AwsCdkDsl CfnForm.Builder.() -> Unit = {}): CfnForm = CfnForm.Builder.create(this, id).apply(initializer).build()
