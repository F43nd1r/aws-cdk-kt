@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.amplifyuibuilder

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amplifyuibuilder.CfnForm
import software.amazon.awscdk.services.amplifyuibuilder.CfnFormProps
import software.constructs.Construct

public fun Construct.cfnForm(
  id: String,
  props: CfnFormProps,
  initializer: CfnForm.() -> Unit = {},
): CfnForm = CfnForm(this, id, props).apply(initializer)
