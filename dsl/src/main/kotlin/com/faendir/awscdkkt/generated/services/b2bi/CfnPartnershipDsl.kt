package com.faendir.awscdkkt.generated.services.b2bi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.b2bi.CfnPartnership
import software.amazon.awscdk.services.b2bi.CfnPartnershipProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPartnership(
  id: String,
  props: CfnPartnershipProps,
  initializer: @AwsCdkDsl CfnPartnership.() -> Unit = {},
): CfnPartnership = CfnPartnership(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPartnership(id: String, initializer: @AwsCdkDsl
    CfnPartnership.Builder.() -> Unit = {}): CfnPartnership = CfnPartnership.Builder.create(this,
    id).apply(initializer).build()
