package com.faendir.awscdkkt.generated.services.athena

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.athena.CfnNamedQuery
import software.amazon.awscdk.services.athena.CfnNamedQueryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNamedQuery(
  id: String,
  props: CfnNamedQueryProps,
  initializer: @AwsCdkDsl CfnNamedQuery.() -> Unit = {},
): CfnNamedQuery = CfnNamedQuery(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnNamedQuery(id: String, initializer: @AwsCdkDsl
    CfnNamedQuery.Builder.() -> Unit = {}): CfnNamedQuery = CfnNamedQuery.Builder.create(this,
    id).apply(initializer).build()
