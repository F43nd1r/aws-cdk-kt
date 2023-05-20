@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps
import software.constructs.Construct

public fun Construct.cfnVerifiedAccessTrustProvider(
  id: String,
  props: CfnVerifiedAccessTrustProviderProps,
  initializer: CfnVerifiedAccessTrustProvider.() -> Unit = {},
): CfnVerifiedAccessTrustProvider = CfnVerifiedAccessTrustProvider(this, id,
    props).apply(initializer)
