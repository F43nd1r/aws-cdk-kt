package com.faendir.awscdkkt.generated.services.config

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.config.CfnStoredQuery
import software.amazon.awscdk.services.config.CfnStoredQueryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStoredQuery(
  id: String,
  props: CfnStoredQueryProps,
  initializer: @AwsCdkDsl CfnStoredQuery.() -> Unit = {},
): CfnStoredQuery = CfnStoredQuery(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnStoredQuery(id: String, initializer: @AwsCdkDsl CfnStoredQuery.Builder.() -> Unit = {}): CfnStoredQuery = CfnStoredQuery.Builder.create(this, id).apply(initializer).build()
