@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.PublicKey
import software.amazon.awscdk.services.cloudfront.PublicKeyProps
import software.constructs.Construct

public fun Construct.publicKey(
  id: String,
  props: PublicKeyProps,
  initializer: PublicKey.() -> Unit = {},
): PublicKey = PublicKey(this, id, props).apply(initializer)
