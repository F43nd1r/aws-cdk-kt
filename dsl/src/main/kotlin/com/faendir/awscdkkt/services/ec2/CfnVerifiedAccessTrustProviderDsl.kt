package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProviderProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVerifiedAccessTrustProvider(
  id: String,
  props: CfnVerifiedAccessTrustProviderProps,
  initializer: CfnVerifiedAccessTrustProvider.() -> Unit = {},
): CfnVerifiedAccessTrustProvider = CfnVerifiedAccessTrustProvider(this, id,
    props).apply(initializer)
