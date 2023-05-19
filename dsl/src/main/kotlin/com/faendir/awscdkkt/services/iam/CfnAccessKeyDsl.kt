@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iam.CfnAccessKey
import software.amazon.awscdk.services.iam.CfnAccessKeyProps
import software.constructs.Construct

public fun Construct.cfnAccessKey(
  id: String,
  props: CfnAccessKeyProps,
  initializer: CfnAccessKey.() -> Unit = {},
): CfnAccessKey = CfnAccessKey(this, id, props).apply(initializer)
