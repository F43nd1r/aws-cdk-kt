@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
