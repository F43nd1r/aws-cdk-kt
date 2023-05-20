@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps
import software.constructs.Construct

public fun Construct.cfnPublicKey(
  id: String,
  props: CfnPublicKeyProps,
  initializer: CfnPublicKey.() -> Unit = {},
): CfnPublicKey = CfnPublicKey(this, id, props).apply(initializer)
