package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.SrvRecord
import software.amazon.awscdk.services.route53.SrvRecordProps
import software.constructs.Construct

@Generated
public fun Construct.srvRecord(
  id: String,
  props: SrvRecordProps,
  initializer: @AwsCdkDsl SrvRecord.() -> Unit = {},
): SrvRecord = SrvRecord(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSrvRecord(id: String, initializer: @AwsCdkDsl SrvRecord.Builder.() -> Unit
    = {}): SrvRecord = SrvRecord.Builder.create(this, id).apply(initializer).build()
