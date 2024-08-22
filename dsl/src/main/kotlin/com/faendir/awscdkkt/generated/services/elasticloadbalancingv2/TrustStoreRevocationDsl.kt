package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocation
import software.amazon.awscdk.services.elasticloadbalancingv2.TrustStoreRevocationProps
import software.constructs.Construct

@Generated
public fun Construct.trustStoreRevocation(
  id: String,
  props: TrustStoreRevocationProps,
  initializer: @AwsCdkDsl TrustStoreRevocation.() -> Unit = {},
): TrustStoreRevocation = TrustStoreRevocation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTrustStoreRevocation(id: String, initializer: @AwsCdkDsl
    TrustStoreRevocation.Builder.() -> Unit = {}): TrustStoreRevocation =
    TrustStoreRevocation.Builder.create(this, id).apply(initializer).build()
