@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.CfnVersionProps
import software.constructs.Construct

public fun Construct.cfnVersion(
  id: String,
  props: CfnVersionProps,
  initializer: CfnVersion.() -> Unit = {},
): CfnVersion = CfnVersion(this, id, props).apply(initializer)
