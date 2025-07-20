package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnRecordSet
import software.amazon.awscdk.services.route53.CfnRecordSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRecordSet(
  id: String,
  props: CfnRecordSetProps,
  initializer: @AwsCdkDsl CfnRecordSet.() -> Unit = {},
): CfnRecordSet = CfnRecordSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRecordSet(id: String, initializer: @AwsCdkDsl CfnRecordSet.Builder.() -> Unit = {}): CfnRecordSet = CfnRecordSet.Builder.create(this, id).apply(initializer).build()
