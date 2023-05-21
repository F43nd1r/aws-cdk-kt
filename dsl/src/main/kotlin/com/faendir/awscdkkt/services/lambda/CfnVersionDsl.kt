package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnVersion
import software.amazon.awscdk.services.lambda.CfnVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVersion(
  id: String,
  props: CfnVersionProps,
  initializer: CfnVersion.() -> Unit = {},
): CfnVersion = CfnVersion(this, id, props).apply(initializer)
