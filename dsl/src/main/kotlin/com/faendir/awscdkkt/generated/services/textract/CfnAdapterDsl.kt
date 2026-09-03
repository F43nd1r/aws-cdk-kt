package com.faendir.awscdkkt.generated.services.textract

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.textract.CfnAdapter
import software.amazon.awscdk.services.textract.CfnAdapterProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAdapter(
  id: String,
  props: CfnAdapterProps,
  initializer: @AwsCdkDsl CfnAdapter.() -> Unit = {},
): CfnAdapter = CfnAdapter(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAdapter(id: String, initializer: @AwsCdkDsl CfnAdapter.Builder.() -> Unit = {}): CfnAdapter = CfnAdapter.Builder.create(this, id).apply(initializer).build()
