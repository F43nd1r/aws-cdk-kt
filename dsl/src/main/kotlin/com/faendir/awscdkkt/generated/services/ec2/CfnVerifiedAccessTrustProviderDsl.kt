package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnVerifiedAccessTrustProvider.() -> Unit = {},
): CfnVerifiedAccessTrustProvider = CfnVerifiedAccessTrustProvider(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnVerifiedAccessTrustProvider(id: String, initializer: @AwsCdkDsl
    CfnVerifiedAccessTrustProvider.Builder.() -> Unit = {}): CfnVerifiedAccessTrustProvider =
    CfnVerifiedAccessTrustProvider.Builder.create(this, id).apply(initializer).build()
