@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnTagOption
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps
import software.constructs.Construct

public fun Construct.cfnTagOption(
  id: String,
  props: CfnTagOptionProps,
  initializer: CfnTagOption.() -> Unit = {},
): CfnTagOption = CfnTagOption(this, id, props).apply(initializer)
