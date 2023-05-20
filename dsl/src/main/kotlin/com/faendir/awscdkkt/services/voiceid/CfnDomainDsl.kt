@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.voiceid

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.voiceid.CfnDomain
import software.amazon.awscdk.services.voiceid.CfnDomainProps
import software.constructs.Construct

public fun Construct.cfnDomain(
  id: String,
  props: CfnDomainProps,
  initializer: CfnDomain.() -> Unit = {},
): CfnDomain = CfnDomain(this, id, props).apply(initializer)
