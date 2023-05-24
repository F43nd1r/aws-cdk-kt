package com.faendir.awscdkkt.generated.services.cassandra

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cassandra.CfnKeyspace
import software.amazon.awscdk.services.cassandra.CfnKeyspaceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnKeyspace(id: String, props: CfnKeyspaceProps): CfnKeyspace =
    CfnKeyspace(this, id, props)

@Generated
public fun Construct.cfnKeyspace(
  id: String,
  props: CfnKeyspaceProps,
  initializer: @AwsCdkDsl CfnKeyspace.() -> Unit,
): CfnKeyspace = CfnKeyspace(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnKeyspace(id: String): CfnKeyspace = CfnKeyspace(this, id)

@Generated
public fun Construct.cfnKeyspace(id: String, initializer: @AwsCdkDsl CfnKeyspace.() -> Unit):
    CfnKeyspace = CfnKeyspace(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnKeyspace(id: String, initializer: @AwsCdkDsl
    CfnKeyspace.Builder.() -> Unit): CfnKeyspace = CfnKeyspace.Builder.create(this,
    id).apply(initializer).build()
