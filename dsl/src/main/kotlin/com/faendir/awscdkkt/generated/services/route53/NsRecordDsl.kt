package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.NsRecord
import software.amazon.awscdk.services.route53.NsRecordProps
import software.constructs.Construct

@Generated
public fun Construct.nsRecord(id: String, props: NsRecordProps): NsRecord = NsRecord(this, id,
    props)

@Generated
public fun Construct.nsRecord(
  id: String,
  props: NsRecordProps,
  initializer: @AwsCdkDsl NsRecord.() -> Unit,
): NsRecord = NsRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNsRecord(id: String, initializer: @AwsCdkDsl NsRecord.Builder.() -> Unit):
    NsRecord = NsRecord.Builder.create(this, id).apply(initializer).build()
