package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.MxRecord
import software.amazon.awscdk.services.route53.MxRecordProps
import software.constructs.Construct

@Generated
public fun Construct.mxRecord(id: String, props: MxRecordProps): MxRecord = MxRecord(this, id,
    props)

@Generated
public fun Construct.mxRecord(
  id: String,
  props: MxRecordProps,
  initializer: @AwsCdkDsl MxRecord.() -> Unit,
): MxRecord = MxRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildMxRecord(id: String, initializer: @AwsCdkDsl MxRecord.Builder.() -> Unit):
    MxRecord = MxRecord.Builder.create(this, id).apply(initializer).build()
