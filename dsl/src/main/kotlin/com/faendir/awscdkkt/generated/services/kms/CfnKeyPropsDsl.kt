package com.faendir.awscdkkt.generated.services.kms

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kms.CfnKeyProps

@Generated
public fun buildCfnKeyProps(initializer: @AwsCdkDsl CfnKeyProps.Builder.() -> Unit = {}):
    CfnKeyProps = CfnKeyProps.Builder().apply(initializer).build()
