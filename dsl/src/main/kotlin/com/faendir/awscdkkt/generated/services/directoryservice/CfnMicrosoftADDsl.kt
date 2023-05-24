package com.faendir.awscdkkt.generated.services.directoryservice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMicrosoftAD(id: String, props: CfnMicrosoftADProps): CfnMicrosoftAD =
    CfnMicrosoftAD(this, id, props)

@Generated
public fun Construct.cfnMicrosoftAD(
  id: String,
  props: CfnMicrosoftADProps,
  initializer: @AwsCdkDsl CfnMicrosoftAD.() -> Unit,
): CfnMicrosoftAD = CfnMicrosoftAD(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMicrosoftAD(id: String, initializer: @AwsCdkDsl
    CfnMicrosoftAD.Builder.() -> Unit): CfnMicrosoftAD = CfnMicrosoftAD.Builder.create(this,
    id).apply(initializer).build()
