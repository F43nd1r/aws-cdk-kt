package com.faendir.awscdkkt.generated.services.dynamodb

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dynamodb.TableV2MultiAccountReplica
import software.amazon.awscdk.services.dynamodb.TableV2MultiAccountReplicaProps
import software.constructs.Construct

@Generated
public fun Construct.tableV2MultiAccountReplica(id: String, initializer: @AwsCdkDsl TableV2MultiAccountReplica.() -> Unit = {}): TableV2MultiAccountReplica = TableV2MultiAccountReplica(this, id).apply(initializer)

@Generated
public fun Construct.tableV2MultiAccountReplica(
  id: String,
  props: TableV2MultiAccountReplicaProps,
  initializer: @AwsCdkDsl TableV2MultiAccountReplica.() -> Unit = {},
): TableV2MultiAccountReplica = TableV2MultiAccountReplica(this, id, props).apply(initializer)

@Generated
public fun Construct.buildTableV2MultiAccountReplica(id: String, initializer: @AwsCdkDsl TableV2MultiAccountReplica.Builder.() -> Unit = {}): TableV2MultiAccountReplica = TableV2MultiAccountReplica.Builder.create(this, id).apply(initializer).build()
