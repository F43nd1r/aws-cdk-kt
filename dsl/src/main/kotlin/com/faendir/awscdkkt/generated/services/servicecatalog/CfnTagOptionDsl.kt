package com.faendir.awscdkkt.generated.services.servicecatalog

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.CfnTagOption
import software.amazon.awscdk.services.servicecatalog.CfnTagOptionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTagOption(
  id: String,
  props: CfnTagOptionProps,
  initializer: @AwsCdkDsl CfnTagOption.() -> Unit = {},
): CfnTagOption = CfnTagOption(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTagOption(id: String, initializer: @AwsCdkDsl
    CfnTagOption.Builder.() -> Unit = {}): CfnTagOption = CfnTagOption.Builder.create(this,
    id).apply(initializer).build()
