package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnKeySigningKey
import software.amazon.awscdk.services.route53.CfnKeySigningKeyProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKeySigningKey(
  id: String,
  props: CfnKeySigningKeyProps,
  initializer: CfnKeySigningKey.() -> Unit = {},
): CfnKeySigningKey = CfnKeySigningKey(this, id, props).apply(initializer)
