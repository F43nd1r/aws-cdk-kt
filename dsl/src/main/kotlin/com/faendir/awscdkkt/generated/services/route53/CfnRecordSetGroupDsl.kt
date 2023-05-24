package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnRecordSetGroup
import software.amazon.awscdk.services.route53.CfnRecordSetGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRecordSetGroup(id: String): CfnRecordSetGroup = CfnRecordSetGroup(this, id)

@Generated
public fun Construct.cfnRecordSetGroup(id: String, initializer: @AwsCdkDsl
    CfnRecordSetGroup.() -> Unit): CfnRecordSetGroup = CfnRecordSetGroup(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnRecordSetGroup(id: String, props: CfnRecordSetGroupProps): CfnRecordSetGroup
    = CfnRecordSetGroup(this, id, props)

@Generated
public fun Construct.cfnRecordSetGroup(
  id: String,
  props: CfnRecordSetGroupProps,
  initializer: @AwsCdkDsl CfnRecordSetGroup.() -> Unit,
): CfnRecordSetGroup = CfnRecordSetGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRecordSetGroup(id: String, initializer: @AwsCdkDsl
    CfnRecordSetGroup.Builder.() -> Unit): CfnRecordSetGroup =
    CfnRecordSetGroup.Builder.create(this, id).apply(initializer).build()
