package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.amazon.awscdk.services.iam.CfnAccessKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAccessKey(
  id: String,
  props: CfnAccessKeyProps,
  initializer: CfnAccessKey.() -> Unit = {},
): CfnAccessKey = CfnAccessKey(this, id, props).apply(initializer)
