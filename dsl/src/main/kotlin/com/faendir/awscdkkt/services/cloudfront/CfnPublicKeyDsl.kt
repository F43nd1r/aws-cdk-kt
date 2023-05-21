package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnPublicKey
import software.amazon.awscdk.services.cloudfront.CfnPublicKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPublicKey(
  id: String,
  props: CfnPublicKeyProps,
  initializer: CfnPublicKey.() -> Unit = {},
): CfnPublicKey = CfnPublicKey(this, id, props).apply(initializer)
