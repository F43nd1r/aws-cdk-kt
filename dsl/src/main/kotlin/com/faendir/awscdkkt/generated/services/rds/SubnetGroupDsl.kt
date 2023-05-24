package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.SubnetGroup
import software.amazon.awscdk.services.rds.SubnetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.subnetGroup(id: String, props: SubnetGroupProps): SubnetGroup =
    SubnetGroup(this, id, props)

@Generated
public fun Construct.subnetGroup(
  id: String,
  props: SubnetGroupProps,
  initializer: @AwsCdkDsl SubnetGroup.() -> Unit,
): SubnetGroup = SubnetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSubnetGroup(id: String, initializer: @AwsCdkDsl
    SubnetGroup.Builder.() -> Unit): SubnetGroup = SubnetGroup.Builder.create(this,
    id).apply(initializer).build()
