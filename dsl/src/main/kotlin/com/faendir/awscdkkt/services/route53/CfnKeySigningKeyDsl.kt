@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnKeySigningKey
import software.amazon.awscdk.services.route53.CfnKeySigningKeyProps
import software.constructs.Construct

public fun Construct.cfnKeySigningKey(
  id: String,
  props: CfnKeySigningKeyProps,
  initializer: CfnKeySigningKey.() -> Unit = {},
): CfnKeySigningKey = CfnKeySigningKey(this, id, props).apply(initializer)
