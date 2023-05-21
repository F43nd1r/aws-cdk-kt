package com.faendir.awscdkkt.services.amplifyuibuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps
import software.constructs.Construct

@Generated
public fun Construct.cfnForm(
  id: String,
  props: CfnFormProps,
  initializer: CfnForm.() -> Unit = {},
): CfnForm = CfnForm(this, id, props).apply(initializer)
