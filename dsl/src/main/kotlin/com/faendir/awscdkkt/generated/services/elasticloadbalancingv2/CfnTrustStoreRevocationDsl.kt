package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrustStoreRevocation(id: String, initializer: @AwsCdkDsl
    CfnTrustStoreRevocation.() -> Unit = {}): CfnTrustStoreRevocation =
    CfnTrustStoreRevocation(this, id).apply(initializer)

@Generated
public fun Construct.cfnTrustStoreRevocation(
  id: String,
  props: CfnTrustStoreRevocationProps,
  initializer: @AwsCdkDsl CfnTrustStoreRevocation.() -> Unit = {},
): CfnTrustStoreRevocation = CfnTrustStoreRevocation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrustStoreRevocation(id: String, initializer: @AwsCdkDsl
    CfnTrustStoreRevocation.Builder.() -> Unit = {}): CfnTrustStoreRevocation =
    CfnTrustStoreRevocation.Builder.create(this, id).apply(initializer).build()
