package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CustomizeRolesOptions

@Generated
public fun customizeRolesOptions(initializer: CustomizeRolesOptions.Builder.() -> Unit = {}):
    CustomizeRolesOptions = CustomizeRolesOptions.builder().apply(initializer).build()
